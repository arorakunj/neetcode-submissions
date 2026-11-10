class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(9):
            nums = set()

            for j in range(9):
                if board[i][j] == ".":
                    continue

                if board[i][j] in nums:
                    return False
                
                nums.add(board[i][j])
        
        for i in range(9):
            nums = set()

            for j in range(9):
                if board[j][i] == ".":
                    continue

                if board[j][i] in nums:
                    return False
                
                nums.add(board[j][i])
        
        boxes = {}

        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    continue
                
                if (i // 3, j // 3) not in boxes:
                    boxes[i // 3, j // 3] = set()
                
                if board[i][j] in boxes[i // 3, j // 3]:
                    return False

                boxes[i // 3, j // 3].add(board[i][j])
                
                
        
        return True
                

