package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;

import java.util.List;

public interface CsvTransactionParser {
    FruitTransaction getFruitTransaction(List<String> operations);
}
