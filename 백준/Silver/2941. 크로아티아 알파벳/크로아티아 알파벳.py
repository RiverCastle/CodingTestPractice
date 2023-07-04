c_a = input()
c_a_list = ['c=','c-','dz=','d-','lj','nj','s=','z=']
count = 0
for i in c_a_list:
    if c_a.count(i):
        count = count + c_a.count(i)
        c_a = c_a.replace(i,' ',c_a.count(i))
c_a = c_a.replace(' ','',count)
print(count+len(c_a))