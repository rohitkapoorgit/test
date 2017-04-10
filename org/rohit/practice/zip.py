a = [1,2,3,4]
x = ['a','b','c','d']
b = ["geeksforgeeks", "geeks", "geekbeturn","geeka"]
print(dict(zip(a,x)))
print(set(zip(a,x)))
print(list(zip(a,x)))
print(zip(a,x))
print(list(zip(*b)))