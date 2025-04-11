from add8 import add8

def test():
    print(add8(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))  # Todos los bits en 0
    print(add8(1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0))  # Acarreo en el primer bit
    print(add8(1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0))  # Casos con unos
    print(add8(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0))  # Todos los bits en 1
    print(add8(1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0))  # Variación de unos y ceros
    print(add8(0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0))  # Activando acarreo progresivo

# Ejecutar la prueba
test()
