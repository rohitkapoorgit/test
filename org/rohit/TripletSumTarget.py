class tripletSum():
    
    def tripletSumTarget(self, l, target):
        
        res = []
        l.sort()
        for i in range(len(l)-2):
            
            j,k=i+1,len(l)-1
            if i>0 and l[i] == l[i-1]:
                continue
            
            while j<k:
                
                sum1 = l[i]+l[j]+l[k]
                if sum1 == target:
                    res.append([l[i], l[j], l[k]])
                    j+=1;k-=1
                    while l[j] == l[j-1] and j<k:
                        j+=1
                    while l[k] == l[k+1] and j<k:
                        k-=1
                    
                elif sum1 > target:
                    k-=1
                    
                elif sum1 < target:
                    j+=1
                    
        return res
    
test = tripletSum()
a = [1,4,2,3,6,8,4,6,5,1]
print(test.tripletSumTarget(a, 8))
                    
                    