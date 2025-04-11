from stats import stats

def test_case_odd_list():
    result = stats([3, 1, 2])
    assert result["min"] == 1
    assert result["max"] == 3
    assert result["median"] == 2
    assert sorted(result["mode"]) == [1, 2, 3]

def test_case_even_list_with_mode():
    result = stats([2, 4, 2, 8])
    assert result["min"] == 2
    assert result["max"] == 8
    assert result["median"] == 3.0
    assert result["mode"] == [2]
