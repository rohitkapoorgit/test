class validParenthesis():
    
    def validPar(self, s):
        
        res = []
        for i in range(len(s)):
            
            if s[i] == '(' or s[i] == '{' or s[i] == '[':
                
                res.append(s[i])
                
            elif s[i] == ')' and res and res[-1] == '(' :
                
                res.pop()
                
            elif s[i] == '}' and res and res[-1] == '{' :
                
                res.pop()
                
            elif s[i] == ']' and res and res[-1] == '[' :
                
                res.pop() 
                
            else:
                
                return False
            
        return not res
    
test = validParenthesis()
print(test.validPar("(){[}]"))
print(test.validPar("(){[]}"))
                
                