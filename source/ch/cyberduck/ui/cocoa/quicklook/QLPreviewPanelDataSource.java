package ch.cyberduck.ui.cocoa.quicklook;

/*
 * Copyright (c) 2002-2009 David Kocher. All rights reserved.
 *
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.ui.cocoa.CDController;

import org.rococoa.ID;
import org.rococoa.cocoa.foundation.NSInteger;

/**
 * @version $Id$
 * @abstract The QLPreviewPanelDataSource protocol declares the methods that the Preview Panel uses to access the contents of its data source object.<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public abstract class QLPreviewPanelDataSource extends CDController {
    /**
     * @param panel The Preview Panel.<br>
     * @abstract Returns the number of items that the preview panel should preview.<br>
     * @result The number of items.<br>
     * Original signature : <code>-(NSInteger)numberOfPreviewItemsInPreviewPanel:(QLPreviewPanel*)</code><br>
     * <i>native declaration : line 12</i>
     */
    public abstract NSInteger numberOfPreviewItemsInPreviewPanel(QLPreviewPanel panel);

    /**
     * @param panel The Preview Panel.<br>
     * @param index The index of the item to preview.<br>
     * @abstract Returns the item that the preview panel should preview.<br>
     * @result An item conforming to the QLPreviewItem protocol.<br>
     * Original signature : <code>-(id<QLPreviewItem>)previewPanel:(QLPreviewPanel*) previewItemAtIndex:(NSInteger)</code><br>
     * <i>native declaration : line 20</i>
     */
    public abstract ID previewPanel_previewItemAtIndex(QLPreviewPanel panel, int index);
}
