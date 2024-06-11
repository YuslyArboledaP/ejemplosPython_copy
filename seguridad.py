# Crear una lista de usuarios conocidos
# usuarios_conocidos = ["Lía", "Yusly", "Keshia", "Lucia", "Jissa"]

# while True:
#     print('Hola, mi nombre es Keto')
#     nombre = input('¿Cómo te llamas? \n').strip().capitalize() #strip elimina espacios en blanco y ccapitalize pone mayuscula inicial
#     if nombre in usuarios_conocidos:
#         print('Hola',nombre,'bienvenido!')
#     else:
#         print('Lo siento, no conozco a',nombre)
#         print('¿Te gustaría ser conocido?')
#         respuesta = input('Si/No \n').strip().lower()
#         if respuesta =='si':
#             usuarios_conocidos.append(nombre)
#             print('Gracias por registrarte')
#         else:
#             print('Vuelve pronto')
#             break 
# for numero in range(0,101,2):
#     print(numero)

# estudiante ={
#     'masculino':['Eno','Banler','Tom','Julio','Mario','Frank'],
#     'femenino':['Ana','Jissa','Yusly','Lía','Luz','Emily']
#     }
# for i in estudiante.keys():
#     for nombre in estudiante[i]:
#         if 'a' in nombre:
#             print(nombre) 


# # triqui

tablero = ["  " for i in range(9)]


def print_triqui():
    for i in range(3):
        fila = f"|{tablero[i*3]}|{tablero[i*3 + 1]}|{tablero[i*3 + 2]}|"
        print(fila)


def jugador(icono):
    if icono == "x":
        num = 1
    else:
        num = 2
    print(f"\nTu turno jugador # {num}")
    while True:
        try:
            eleccion = int(input("Ingrese su movimiento(1-9)\n").strip())
            if eleccion >= 1 and eleccion <= 9:
                if tablero[eleccion - 1] == "  ":
                    tablero[eleccion - 1] = icono + " "
                    break
                else:
                    print("El espacio está ocupado, Intente de nuevo \n")
            else:
                print("Movimiento inválido, ingrese un número entre 1 y 9\n")
        except ValueError:
            print("Movimiento inválido\n")


def ganador(icono):
    icono = icono + " "
    if (
        (tablero[0] == icono and tablero[1] == icono and tablero[2] == icono)
        or (tablero[3] == icono and tablero[4] == icono and tablero[5] == icono)
        or (tablero[6] == icono and tablero[7] == icono and tablero[8] == icono)
        or (tablero[0] == icono and tablero[3] == icono and tablero[6] == icono)
        or (tablero[1] == icono and tablero[4] == icono and tablero[7] == icono)
        or (tablero[2] == icono and tablero[5] == icono and tablero[8] == icono)
        or (tablero[0] == icono and tablero[4] == icono and tablero[8] == icono)
        or (tablero[2] == icono and tablero[4] == icono and tablero[6] == icono)
    ):
        return True
    else:
        return False


def empate():
    if "  " not in tablero:
        return True
    else:
        return False


while True:
    print_triqui()
    jugador("x")
    print_triqui()
    if ganador("x"):
        print("Felicitaciones jugador 1, has ganado")
        break
    elif empate():
        print("Es un empate")
        break
    jugador("o")
    if ganador("o"):
        print_triqui()
        print("Felicitaciones jugador 2, has ganado")
        break
    elif empate():
        print("Es un empate")
        break
