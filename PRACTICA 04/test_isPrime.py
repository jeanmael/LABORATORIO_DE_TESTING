import pytest
from isPrime import isPrime, isPrime2 

def test_isPrime():
    assert isPrime(1) == False
    assert isPrime(2) == True  
    assert isPrime(3) == True
    assert isPrime(4) == False
    assert isPrime(5) == True
    assert isPrime(20) == False
    assert isPrime(21) == False
    assert isPrime(22) == False
    assert isPrime(23) == True
    assert isPrime(24) == False
    assert isPrime(25) == False 

def test_isPrime2():
    assert isPrime2(1) == False
    assert isPrime2(2) == True  
    assert isPrime2(3) == True
    assert isPrime2(4) == False
    assert isPrime2(5) == True
    assert isPrime2(20) == False
    assert isPrime2(21) == False
    assert isPrime2(22) == False
    assert isPrime2(23) == True
    assert isPrime2(24) == False
    assert isPrime2(25) == False 