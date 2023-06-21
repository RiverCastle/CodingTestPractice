#include <stdio.h>
int main()
{
	int n, i, x, v;
	scanf("%d %d", &n, &x);
	for (i = 0; i < n; i++)
	{
		scanf("%d", &v);
		if (v < x) printf("%d ", v);
	}
}