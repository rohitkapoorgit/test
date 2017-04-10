class atoi():
    
    def implementATOI(self, s):
        
        result = 0
        for i in range(len(s)):
            
            digit = ord(s[i])-ord('0')
            result = result*10 + digit
            
        return result
    
test = atoi()
print(test.implementATOI('4683'))