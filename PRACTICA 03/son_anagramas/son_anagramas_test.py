from son_anagramas import son_anagramas

def test_anagramas():
    assert son_anagramas("Roma", "Amor") is True
    assert son_anagramas("Listen", "Silent") is True
    assert son_anagramas("Hola", "Mundo") is False
    print("Todas las pruebas pasaron correctamente.")

if __name__ == "__main__":
    test_anagramas()
