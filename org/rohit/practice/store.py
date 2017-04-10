from classex2 import MyClass

x = MyClass()
y = MyClass()


import shelve
db = shelve.open("database")
i=0
for obj in (x,y):
    db[obj.__class__.__name__ + str(i)] = obj
    i+=1
db.close()
