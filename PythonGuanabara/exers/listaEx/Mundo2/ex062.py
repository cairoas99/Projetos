p = int(input('Primeiro termo: '))
r = int(input('Razão: '))
f = int(r * 11)
c = 1
while c != 0:
    while p < f:
        print(p)
        p = p+r
    c = int(input('deseja repetir quantas vezes mais? '))
    f += (r*c)