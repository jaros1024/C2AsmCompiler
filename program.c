#include <stdio.h>
#define VALUE 10

/* this is a block, multi-line comment
hehe */
int global = 5;
int blabla;

int read_number();

int main()
{
   int number;

   number = read_number();
   while(number > 5){
        printf("Number = %d\n", number);
        number = number - 1;
   }

   return 0;
}

int read_number(){
    int result;
    long result_ptr;

    result_ptr = &result;
    printf("Enter a number:\n");
    scanf("%d", result_ptr);

    return result;
}