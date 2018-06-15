#include <stdio.h>
#define VALUE 10

int ab;
int test = 5;
void blabla(int arg, char znak);
/* this is a block, multi-line comment
hehe */
int main()
{
   // printf() displays the string inside quotation
   //printf("Hello, World!\n");
   blabla(test);
   return 0;
}

void blabla(int arg, char znak)
{
	printf("arg = %d", arg);
}
