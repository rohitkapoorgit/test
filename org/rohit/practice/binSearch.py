class BinSearch():
    
    def binarySearch(self, seq, target):
        
        beg = 0
        end = len(seq)
        while beg<=end:
            
            mid = int((beg+end)/2)
            if target == seq[mid]:
                
                return mid+1
                
            elif  target > seq[mid]:
                
                beg = mid+1
                
            else:
            
                end = mid-1
                
        
        return "Not found"
    
test = BinSearch()
print(test.binarySearch([2,4,5,6,8], 7))
        
        
        