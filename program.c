#include <stdio.h>
#define VALUE 10

/* this is a block, multi-line comment
hehe */
int global = 5;
int blabla;

int main()
{
   int zmienna = 0;

   while(!zmienna){
        printf("Test zmienna = %d\n", zmienna);
        zmienna = zmienna + 1;
   }

   return 0;
}