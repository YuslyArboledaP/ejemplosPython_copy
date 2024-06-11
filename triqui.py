tablero = ["  " for i in range(9)]


def print_triqui():
    for i in range(3):
        fila = f"|{tablero[i*3]}|{tablero[i*3 + 1]}|{tablero[i*3 + 2]}|"
        print(fila)


def jugador(turno):

    if turno == "x":
        num = 1
    else:
        num = 2
    print(f"\nTu turno jugador # {num}")
    while True:
        try:
            eleccion = int(input("Ingrese su movimiento(1-9)\n").strip())
            if eleccion >= 1 and eleccion <= 9:
                if tablero[eleccion - 1] == " ":
                    tablero[eleccion - 1] = turno + ""
                    break
                else:
                    print("El espacio está ocupado, Intente de nuevo \n")
            else:
                print("Movimiento inválido, ingrese un número entre 1 y 9\n")
        except ValueError:
            print("Movimiento inválido\n")


def ganador(icono):
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
    if ganador("x"):
        print("Felicitaciones jugador 1, has ganado")
        break
    elif empate():
        print("Es un empate")
        break
    print_triqui()
    jugador("o")
    if ganador("o"):
        print("Felicitaciones jugador 2, has ganado")
        break
    elif empate():
        print("Es un empate")
        break
