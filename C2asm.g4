grammar C2asm;

@header {
package com.perez.jaroslav.compiler.antlr;
}

compilationUnit
    : preprocessor_directive* external_declaration+
	;

/*
external_declaration
	: ( declaration_specifiers? declarator declaration* '{' ) function_definition
	| declaration
	;
*/

external_declaration
    : declaration
    | function_definition
    ;


/*function_definition
	:	declaration_specifiers? variable_declarator
		(	declaration+ compound_statement	// K&R style
		|	compound_statement				// ANSI style
		)
	;*/

/*function_definition
	:	declaration_specifiers? variable_declarator declaration+ compound_statement
	;*/

function_definition
	:	declaration_specifiers function_direct_declarator compound_statement
	;

preprocessor_directive
    : (include | define)
    ;

include
    : '#include' ('<' header_file '>' | '"' header_file '"')
    ;

header_file
    : IDENTIFIER '.h'
    ;

define
    : '#define' IDENTIFIER DECIMAL_LITERAL
    ;

/*declaration
	: 'typedef' declaration_specifiers?
	  init_declarator_list ';' // special case, looking for typedef
	| declaration_specifiers init_declarator_list? ';'
	;*/

/*declaration
	: declaration_specifiers init_declarator_list? ';'
	;*/

declaration
    : variable_declaration
    | function_declaration
    ;

function_declaration
    : declaration_specifiers function_direct_declarator ';'
    ;

variable_declaration
    : declaration_specifiers variable_init_declarator_list ';'
    ;

declaration_specifiers
	:   (   storage_class_specifier
		|   type_specifier
        |   type_qualifier
        )+
	;

variable_init_declarator_list
	: init_declarator (',' init_declarator)*
	;

init_declarator
	: variable_declarator ('=' initializer)?
	;

storage_class_specifier
	: 'extern'
	| 'static'
	| 'auto'
	| 'register'
	;

type_specifier
	: 'void'
	| 'char'
	| 'short'
	| 'int'
	| 'long'
	| 'float'
	| 'double'
	| 'signed'
	| 'unsigned'
	| struct_specifier
	| enum_specifier
	| IDENTIFIER
	;

struct_specifier
	: struct IDENTIFIER? '{' struct_declaration_list '}'
	| struct IDENTIFIER
	;

struct
	: 'struct'
	;

struct_declaration_list
	: struct_declaration+
	;

struct_declaration
	: specifier_qualifier_list struct_declarator_list ';'
	;

specifier_qualifier_list
	: ( type_qualifier | type_specifier )+
	;

struct_declarator_list
	: struct_declarator (',' struct_declarator)*
	;

struct_declarator
	: variable_declarator (':' constant_expression)?
	| ':' constant_expression
	;

enum_specifier
	: 'enum' '{' enumerator_list '}'
	| 'enum' IDENTIFIER '{' enumerator_list '}'
	| 'enum' IDENTIFIER
	;

enumerator_list
	: enumerator (',' enumerator)*
	;

enumerator
	: IDENTIFIER ('=' constant_expression)?
	;

type_qualifier
	: 'const'
	| 'volatile'
	;

variable_declarator
	: pointer? variable_direct_declarator
	| pointer
	;

/*variable_direct_declarator
	:   (	IDENTIFIER
		|	'(' variable_declarator ')'
		)
        declarator_suffix*
	;*/

variable_direct_declarator
    : IDENTIFIER variable_declarator_suffix*
    ;

/*variable_declarator_suffix
	:   '[' constant_expression ']'
    |   '[' ']'
    |   '(' parameter_type_list ')'
    |   '(' identifier_list ')'
    |   '(' ')'
	;*/

variable_declarator_suffix
	:   '[' constant_expression ']'
    |   '[' ']'
	;

function_direct_declarator
    : IDENTIFIER '(' parameter_type_list* ')'
    ;

pointer
	: '*' type_qualifier+ pointer?
	| '*' pointer
	| '*'
	;

parameter_type_list
	: parameter_list (',' '...')?
	;

parameter_list
	: parameter_declaration (',' parameter_declaration)*
	;

parameter_declaration
	: declaration_specifiers (variable_declarator|abstract_declarator)*
	;

identifier_list
	: IDENTIFIER (',' IDENTIFIER)*
	;

type_name
	: specifier_qualifier_list abstract_declarator?
	;

abstract_declarator
	: pointer direct_abstract_declarator?
	| direct_abstract_declarator
	;

direct_abstract_declarator
	:	( '(' abstract_declarator ')' | abstract_declarator_suffix ) abstract_declarator_suffix*
	;

abstract_declarator_suffix
	:	'[' ']'
	|	'[' constant_expression ']'
	|	'(' ')'
	|	'(' parameter_type_list ')'
	;

initializer
	: assignment_expression
	| '{' initializer_list ','? '}'
	;

initializer_list
	: initializer (',' initializer)*
	;

// E x p r e s s i o n s

argument_expression_list
	:   assignment_expression+ (',' assignment_expression)*
	;

additive_expression
	: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*
	;

multiplicative_expression
	: (cast_expression) ('*' cast_expression | '/' cast_expression | '%' cast_expression)*
	;

cast_expression
	: '(' type_name ')' cast_expression
	| unary_expression
	;

unary_expression
	: postfix_expression
	| '++' unary_expression
	| '--' unary_expression
	| unary_operator cast_expression
	| 'sizeof' unary_expression
	| 'sizeof' '(' type_name ')'
	;

postfix_expression
	:   primary_expression
        (   '[' expression ']'
        |   '(' ')'
        |   '(' argument_expression_list ')'
        |   '.' IDENTIFIER
        |   '->' IDENTIFIER
        |   '++'
        |   '--'
        )*
	;

unary_operator
	: '&'
	| '*'
	| '+'
	| '-'
	| '~'
	| '!'
	;

primary_expression
	: IDENTIFIER
	| constant
	| '(' expression ')'
	;

constant
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |	CHARACTER_LITERAL
	|	STRING_LITERAL
    |   FLOATING_POINT_LITERAL
    ;

/////

expression
	: assignment_expression (',' assignment_expression)*
	;

constant_expression
	: conditional_expression
	;

assignment_expression
	: lvalue assignment_operator assignment_expression
	| conditional_expression
	;

lvalue
	:	unary_expression
	;

assignment_operator
	: '='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|='
	;

conditional_expression
	: logical_or_expression ('?' expression ':' conditional_expression)?
	;

logical_or_expression
	: logical_and_expression ('||' logical_and_expression)*
	;

logical_and_expression
	: inclusive_or_expression ('&&' inclusive_or_expression)*
	;

inclusive_or_expression
	: exclusive_or_expression ('|' exclusive_or_expression)*
	;

exclusive_or_expression
	: and_expression ('^' and_expression)*
	;

and_expression
	: equality_expression ('&' equality_expression)*
	;
equality_expression
	: relational_expression (('=='|'!=') relational_expression)*
	;

relational_expression
	: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*
	;

shift_expression
	: additive_expression (('<<'|'>>') additive_expression)*
	;

// S t a t e m e n t s

statement
	: labeled_statement
	| compound_statement
	| expression_statement
	| selection_statement
	| iteration_statement
	| jump_statement
	;

/*statement
    : jump_statement
    ;*/

labeled_statement
	: 'case' constant_expression ':' statement
	| 'default' ':' statement
	;

compound_statement
	: '{' declaration* statement_list? '}'
	;

statement_list
	: statement+
	;

expression_statement
	: ';'
	| expression ';'
	;

selection_statement
	: 'if' '(' expression ')' statement (:else_statement statement)?
	| 'switch' '(' expression ')' statement
	;

else_statement
    : 'else'
    ;

iteration_statement
	: while_statement
	| do_statement
	| for_statement
	;

while_statement
    : 'while' '(' expression ')' statement
    ;

do_statement
    : 'do' statement 'while' '(' expression ')' ';'
    ;

for_statement
    : 'for' '(' expression_statement expression_statement expression? ')' statement
    ;

jump_statement
	: 'continue' ';'
	| 'break' ';'
	| 'return' ';'
	| 'return' expression ';'
	;


IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;

fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

CHARACTER_LITERAL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix? ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix
	:	('u'|'U')? ('l'|'L')
	|	('u'|'U')  ('l'|'L')?
	;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') -> skip
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> skip
    ;

BLOCK_COMMENT
    : '/*' ( ~'*' | ( '*'+ ~[/*]) )* '*'* '*/' -> skip
    ;


// ignore #line info for now
/*LINE_COMMAND
    : '#' ~('\n'|'\r')* '\r'? '\n'
    ;*/
