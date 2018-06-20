#include <stdio.h>
#define VALUE 10

/* this is a block, multi-line comment
hehe */
int global = 5;
int blabla;

int main()
{
   int zmienna = 1;
   while(zmienna != 10){
      zmienna = zmienna + 1;
      printf("zmienna = %d\n", zmienna);
   }

   return 0;
}