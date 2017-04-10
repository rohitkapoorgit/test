class reverseInteger():
    
    def revInt(self, n):
        
        temp = 0
        sign = 1
        if n<0:
            
            sign = -1
            n = abs(n)
            
        while n != 0:
            
            a = n%10
            temp = temp*10 + a
            n = n//10
            
        return temp*sign
    
test = reverseInteger()
print(test.revInt(-462))
            