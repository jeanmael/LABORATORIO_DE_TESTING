def palindromo_o_capicua(dato):
    if type(dato) == int:
        return str(dato) == str(dato)[::-1]
    elif type(dato) == str:
        dato = dato.replace(" ", "").lower()
        return dato == dato[::-1]
    return False
