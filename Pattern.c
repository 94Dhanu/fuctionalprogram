#include<stdio.h>

int main()
{
	int i=0, j=0, irow=4,icol=4;

	for(i = 0; i<irow; i++)
	{
		for(j = 0; j<icol; j++)
		{
			if(j>=(icol-i))
			{
				printf("*");
			}		
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	
	}
	
}
