package ru.klkvsk.fenom.file;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;
import ru.klkvsk.fenom.file.FenomFileType;

public class FenomFileTypeFactory extends FileTypeFactory{
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(FenomFileType.INSTANCE, "fm");
    }
}