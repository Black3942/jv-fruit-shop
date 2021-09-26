package core.basesyntax.service.impl;

import core.basesyntax.service.*;
import java.io.*;

public class WriterServiceImpl implements WriterService {
    private static final String MESSAGE = "Can't write to a file: ";

    @Override
    public void write(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
        } catch (IOException e) {
            throw new RuntimeException(MESSAGE + fileName, e);
        }
    }
}
