from palindromo_o_capicua import palindromo_o_capicua

def test_numeros_capicua():
    assert palindromo_o_capicua(12321) is True
    assert palindromo_o_capicua(1221) is True
    assert palindromo_o_capicua(12345) is True

def test_cadenas_palindromas():
    assert palindromo_o_capicua("Anita lava la tina") is True
    assert palindromo_o_capicua("reconocer") is True
    assert palindromo_o_capicua("Hola mundo") is False

if __name__ == "__main__":
    test_numeros_capicua()
    test_cadenas_palindromas()
    print("Todas las pruebas pasaron correctamente.")
