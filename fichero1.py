# # print("Hola"); print("Yusly")

# mi_nombre="Mi nombre es Yusly"

# edad= int(input('Ingrese su edad \n'))

# #print(mi_nombre)

# def mensaje():
#     print(mi_nombre,'y tengo',edad,'años')

# mensaje()
# num=5
# fin=0
# while(num>fin):
#     num-=1
#     print(num)
# else:
#     print('Ya termino!')

# lista = [3, 'Hola', True]

# diccionario = {
# 'clave1': 'Mi primer valor',
# 'clave3': 'Y, como no, mi tercer valor',
# 'clave2': 'Este es mi segundo valor'
# }
# print(list(diccionario))
# print(sorted(diccionario))
# mi_diccionario ={
#     'nombre':'Python',
#     'edad':30,
#     'version':3.9
# }
# print(list(mi_diccionario))
# print(sorted(mi_diccionario diccionario))
# from networkx import ra_index_soundarajan_hopcroft

""" 
i = 1
while i <= 5:
    print(i)
    i += 1
else:
    print("-------------")
    i -= 1
    while i >= 1:
        print(i)
        i -= 1
 """

""" class Coche:
    largochasis = 250
    anchochasis = 120
    rueda = 4
    color = "rojo"

    def arrancar(self):
        self.enmarcha = True

    def estado(self):
        if self.enmarcha:
            return "El coche esta en marcha"
        else:
            return "El coche esta parado"


miCoche = Coche()
print(miCoche.anchochasis)
# print miCoche.largochasis
print(miCoche.rueda)
print(miCoche.estado) """
"""
IVA=0.21
valProducto=int(input('Ingrese el precio del producto\n'))

 def ejercicio_1(precio):
    precio_total=precio+(precio*IVA)
    return precio_total

print('el valor total a pagar es',ejercicio_1(valProducto)) """
""" est=input('Ingrese el nombre del estudiante\n')
asig=input('Ingrese la asignatura\n')
maxi=5.0
i=1
nota_def=0
while i<=3:
    nota=float(input(f'Ingrese la nota del parcial {i}\n'))
    i
    if nota>maxi:
        print('Recuerda que la nota máxima debe ser',maxi,'digite nuevamente \n')
    else:
        if i==1:
            nota_def=nota_def+nota*0.25
        elif i==2:
            nota_def=nota_def+nota*0.20
        else:
            nota_def=nota_def+nota*0.55
        i+=1
print (est,'la nota definivida de la asignatura',asig,'es',nota_def) """

""" asig=input('Ingrese la asignatura\n')
n=int(input('Ingrese el número de estudiantes\n'))
nest=0
maxi=5.0
nota_def_may=0
acu_nota_def=0
while True:
    est=input('Ingrese el nombre del estudiante\n')
    nota_def=0
    i=1
    while i<=3:
        nota=float(input(f'Ingrese la nota del parcial {i}\n'))
        if nota>maxi:
            print('Recuerda que la nota máxima debe ser',maxi,'digite nuevamente \n')
        else:
            if i==1:
                nota_def=nota_def+nota*0.25
            elif i==2:
                nota_def=nota_def+nota*0.20
            else:
                nota_def=nota_def+nota*0.55
            i+=1
        if nota_def>nota_def_may:
            nota_def_may=nota_def
            est_nota_def=est
    acu_nota_def +=nota_def   
    nest+=1
    if(nest==n):
        break
acu_nota_def/=n
print ('El promedio de notas de la asignatura',asig,'es:',acu_nota_def)
print ('En la asignatura',asig,'la mayor nota es',est_nota_def,'del estudiante',est_nota_def) """

""" asig=input('Ingrese la asignatura\n')

nest=0 
maxi=5.0
nota_def_may=0
acu_nota_def=0
while True:
    est=input('Ingrese el nombre del estudiante\n')
    nota_def=0
    i=1
    while i<=3:
        nota=float(input(f'Ingrese la nota del parcial {i}\n'))
        if nota>maxi:
            print('Recuerda que la nota máxima debe ser',maxi,'digite nuevamente \n')
        else:
            if i==1:
                nota_def=nota_def+nota*0.25
            elif i==2:
                nota_def=nota_def+nota*0.20
            else:
                nota_def=nota_def+nota*0.55
            i+=1
        if nota_def>nota_def_may:
            nota_def_may=nota_def
            est_nota_def=est
    acu_nota_def +=nota_def   
    n=int(input('Desea ingresar un nuevo estudiantes? 1:Si 2:No\n'))
    if(n==2):
        break
acu_nota_def/=n
print ('El promedio de notas de la asignatura',asig,'es:',acu_nota_def)
print ('E n la asignatura',asig,'la mayor nota es',nota_def_may,'del estudiante',est_nota_def)"""

# val_dia=136000
# empl=input("Ingrese el nombre del empleado")
# cant=int(input('Ingrese los días laborados'))
# salario=cant*val_dia
# if(cant==30):
