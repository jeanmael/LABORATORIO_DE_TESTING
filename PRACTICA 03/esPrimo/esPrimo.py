def esPrimo(num):
    if num < 2:
        return False
    for n in range(2, num // 2 + 1):
        if num % n == 0:
            print(f"No es primo, {n} es divisor.")
            return False
    return True
