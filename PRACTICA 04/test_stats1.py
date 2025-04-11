from stats import stats1

def test_case_even_list_with_same_elements():
    result = stats1([5, 5, 5, 5])
    assert result["median"] == 5  # Este test NO detecta el error

def test_case_even_list_error_detected():
    result = stats1([1, 2, 3, 4])
    assert result["median"] == 2.5  # Este test SÍ detecta el error
