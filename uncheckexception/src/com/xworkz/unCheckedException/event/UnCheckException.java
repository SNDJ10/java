package com.xworkz.unCheckedException.event;

import javax.print.attribute.UnmodifiableSetException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import java.awt.color.CMMException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.ProviderNotFoundException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.time.DateTimeException;
import org.w3c.dom.DOMException;
import java.lang.EnumConstantNotPresentException;
import org.w3c.dom.events.EventException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.lang.IllegalMonitorStateException;
import java.lang.IllegalStateException;
import java.awt.geom.IllegalPathStateException;
import java.util.IllformedLocaleException;
import java.awt.image.ImagingOpException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.IndexOutOfBoundsException;
import javax.management.JMRuntimeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import javax.lang.model.type.MirroredTypesException;
import javax.lang.model.type.MirroredTypeException;
import java.util.MissingResourceException;
import java.lang.NegativeArraySizeException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.NoSuchMechanismException;
import java.awt.color.ProfileDataException;
import java.security.ProviderException;
import java.awt.image.RasterFormatException;
import java.util.concurrent.RejectedExecutionException;
import org.w3c.dom.ls.LSException;
import java.lang.TypeNotPresentException;
import java.io.UncheckedIOException;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import javax.xml.ws.WebServiceException;
import java.lang.invoke.WrongMethodTypeException;
import java.util.concurrent.CompletionException;

public class UnCheckException {

    public void annotationTypeMissmatchException(){
        throw new AnnotationTypeMismatchException(null,null);
    }
    public void arithmeticException(){
        throw new ArithmeticException();
    }
    public void arrayStoreException(){
        throw new ArrayStoreException();
    }
    public void bufferOverflowException(){
        throw new BufferOverflowException();
    }
    public void bufferUnderFlowException(){
        throw new BufferUnderflowException();
    }
    public void cannotRedoException(){
        throw new CannotRedoException();
    }
    public void cannotUndoException(){
        throw new CannotUndoException();
    }
    public void classCastException(){
        throw new ClassCastException();
    }
    public void cmmException(){
        throw new CMMException("");
    }
    public void completionException(){
        throw new CompletionException(null);
    }
    public void concurrentModificationException(){
        throw new ConcurrentModificationException();
    }
    public void dateTimeException(){
        throw new DateTimeException("");
    }
    public void domException(){
        throw new DOMException((short)0, "");
    }
    public void emptyStackException(){
        throw new EmptyStackException();
    }
    public void enumConstantNotPresentException(){
        throw new EnumConstantNotPresentException(Thread.State.class, "RUNNING");
    }
    public void eventException(){
        throw new EventException((short)0, "");
    }
    public void fileSystemAlreadyExistsException(){
        throw new FileSystemAlreadyExistsException();
    }
    public void fileSystemNotFoundException(){
        throw new FileSystemNotFoundException();
    }
    public void illegalArgumentException(){
        throw new IllegalArgumentException();
    }
    public void illegalMonitorStateException(){
        throw new IllegalMonitorStateException();
    }
    public void illegalPathStateException(){
        throw new IllegalPathStateException();
    }
    public void illegalStateException(){
        throw new IllegalStateException();
    }
    public void illformedLocaleException(){
        throw new IllformedLocaleException();
    }
    public void imagingOpException(){
        throw new ImagingOpException("");
    }
    public void incompleteAnnotationException(){
        throw new IncompleteAnnotationException(Override.class, "");
    }
    public void indexOutOfBoundsException(){
        throw new IndexOutOfBoundsException();
    }
    public void jmRuntimeException(){
        throw new JMRuntimeException();
    }
    public void lsException(){
        throw new LSException((short) 0,"null");
    }
    public void malformedParameterizedTypeException(){
        throw new MalformedParameterizedTypeException();
    }
    public void malformedParametersException(){
        throw new MalformedParametersException();
    }
    public void mirroredTypesException(){
        throw new MirroredTypesException(null);
    }
    public void mirroredTypeException(){
        throw new MirroredTypeException(null);
    }
    public void missingResourceException(){
        throw new MissingResourceException("","","");
    }
    public void negativeArraySizeException(){
        throw new NegativeArraySizeException();
    }
    public void noSuchElementException(){
        throw new NoSuchElementException();
    }
    public void noSuchMechanismException(){
        throw new NoSuchMechanismException();
    }
    public void nullPointerException(){
        throw new NullPointerException();
    }
    public void profileDataException(){
        throw new ProfileDataException("");
    }
    public void providerException(){
        throw new ProviderException();
    }
    public void providerNotFoundException(){
        throw new ProviderNotFoundException();
    }
    public void rasterFormatException(){
        throw new RasterFormatException("");
    }
    public void rejectedExecutionException(){
        throw new RejectedExecutionException();
    }
    public void securityException(){
        throw new SecurityException();
    }
    //    public void systemException(){
//        throw new SystemException();
//    }
    public void typeConstraintException(){
        throw new TypeConstraintException("");
    }
    public void typeNotPresentException(){
        throw new TypeNotPresentException("", null);
    }
    public void uncheckedIOException(){
        throw new UncheckedIOException(new IOException());
    }
    public void undeclaredThrowableException(){
        throw new UndeclaredThrowableException(null);
    }
    //    public void unknownEntityException(){
//        throw new UnknownEntityException();
//    }
    public void unmodifiableSetException(){
        throw new UnmodifiableSetException();
    }
    public void unsupportedOperationException(){
        throw new UnsupportedOperationException();
    }
    public void webServiceException(){
        throw new WebServiceException();
    }
    public void wrongMethodTypeException(){
        throw new WrongMethodTypeException();
    }
    public void dataBindingException(){
        throw new DataBindingException(null);
    }
}
