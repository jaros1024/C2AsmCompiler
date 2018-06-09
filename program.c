#include <stdio.h>

struct family
{
	int a;
	int b;
	int c;
}

int test = 5;
void blabla(int arg);
/* this is a block, multi-line comment
hehe */
int main()
{
   // printf() displays the string inside quotation
   printf("Hello, World!\n");
   blabla(test);
   return 0;
}

void blabla(int arg)
{
	printf("arg = %d", arg);
}
