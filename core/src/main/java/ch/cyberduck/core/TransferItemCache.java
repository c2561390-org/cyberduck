package ch.cyberduck.core;

/*
 * Copyright (c) 2002-2015 David Kocher. All rights reserved.
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
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.transfer.TransferItem;

public class TransferItemCache extends AbstractCache<TransferItem> {

    private static final TransferItem NULL_KEY = new TransferItem(null);

    public TransferItemCache(final int size) {
        super(size);
    }

    @Override
    public CacheReference<?> reference(final TransferItem object) {
        return new DefaultPathPredicate(object.remote);
    }

    @Override
    public boolean containsKey(final TransferItem key) {
        return super.containsKey(null == key ? NULL_KEY : key);
    }

    @Override
    public AttributedList<TransferItem> get(final TransferItem key) {
        return super.get(null == key ? NULL_KEY : key);
    }

    @Override
    public AttributedList<TransferItem> put(final TransferItem key, final AttributedList<TransferItem> children) {
        return super.put(null == key ? NULL_KEY : key, children);
    }
}
