def intersect(*args):
    res = []
    for x in args[0]:
        for other in args[1:]:
            if x not in other: 
                break
        else:
            res.append(x)
    return res

def sumtree(L):
    tot = 0
    for x in L:
        if not isinstance(x, list):
            tot += x
        else:
            tot += sumtree(x)
    return tot


print(intersect("SCAM","SPAM","SLAM"))
print(sumtree([1, [2, [3, 4], 5], 6, [7, 8]]))