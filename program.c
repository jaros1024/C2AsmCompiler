#include <stdio.h>
#define VALUE 10

int ab;
int test = 5;
void blabla(int arg, char znak);
int sample_function();
/* this is a block, multi-line comment
hehe */
int main()
{
   int zmienna = 8;
   // printf() displays the string inside quotation
   printf("Hello, World!\n");
   blabla(zmienna);
   blabla(test);
   //return ab;
   return 0;
}

void blabla(int arg)
{
	printf("arg = %d\n", arg);
}

int sample_function()
{
    blabla(test);
    blabla(8);
    return 3;
}
