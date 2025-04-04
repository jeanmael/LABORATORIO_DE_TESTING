def son_anagramas(text1: str, text2: str) -> bool:
    return sorted(text1.replace(" ", "").lower()) == sorted(text2.replace(" ", "").lower())

