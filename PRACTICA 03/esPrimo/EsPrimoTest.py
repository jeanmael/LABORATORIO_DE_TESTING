from esPrimo import esPrimo

def test_es_primo():
    resultado = esPrimo(1)
    assert resultado is False

def test_no_es_primo():
    resultado = esPrimo(10)
    assert resultado is True

if __name__ == "__main__":
    test_es_primo()
    test_no_es_primo()
    print("Todas las pruebas pasaron correctamente.")
