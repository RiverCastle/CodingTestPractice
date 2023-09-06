import sys 

t = int(input())
nl = []
for i in range(t):
    nl.append(int(sys.stdin.readline()))
nl.sort()
for i in nl:
    print(i)