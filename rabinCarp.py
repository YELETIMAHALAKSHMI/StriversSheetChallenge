def stringMatch(txt, pat):
    res = []
    d = 256
    q = 101
    M = len(pat)
    N = len(txt)
    if M > N:
        return res
    i = 0
    j = 0
    p = 0    
    t = 0 
    h = 1
    h = pow(d, M-1)%q
    for i in range(M):
        p = (d*p + ord(pat[i])) % q
        t = (d*t + ord(txt[i])) % q
    for i in range(N-M+1):
        if p == t:
            j = 0
            while j < M:
                if txt[i+j] != pat[j]:
                    break
                j += 1
            if j == M:
                res.append(i)
        if i < N-M:
            t = (d*(t-ord(txt[i])*h) + ord(txt[i+M])) % q
            if t < 0:
                t = t+q
    return res
