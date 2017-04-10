import shelve
db = shelve.open("database")
for key in db.keys():
    print(key, db[key])
db.close()