class sumList():
    
    def sumSubset(self, l, sum1):
        
        s = set()
        result = []
        for x in l:
            
            target = sum1-x
            if target not in s:
                
                s.add(x)
                
            else:
                
                result.extend([x,target])
                break
            
        return result
    
test = sumList()
a = [1,5,3,7,8,4,2,3]
print(test.sumSubset(a, 6))
                
            
            