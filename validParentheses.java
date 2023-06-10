def isValidParenthesis(expression):

    # Write your code here.
    stack=[]
    for i in range (0,len(expression)):
        el=expression[i]
        if ((el=='(')or(el=='{')or(el=='[')):
            stack.append(el)
        else:
            if stack:
                top=stack[-1]
                if ((top=='(' and el==')')or(top=='{' and el=='}')or
                    (top=='[' and el==']')):
                    stack.pop()
                else:
                    return False
            else:
                return False
    if stack:
        return False
    return True
    pass





# Main Code

t = int(input().strip())

for i in range(t):
    str = input().strip()
    ans = isValidParenthesis(str)

    if ans:
        print("Balanced")
        
    else:
        print("Not Balanced")
