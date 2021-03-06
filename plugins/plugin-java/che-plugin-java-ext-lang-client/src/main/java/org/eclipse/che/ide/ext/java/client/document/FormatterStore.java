/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ext.java.client.document;

import org.eclipse.che.ide.api.editor.document.Document;
import org.eclipse.che.ide.ext.java.jdt.text.TextStore;

/**
 * Provides access to the stored text into document and allows to manipulate it.
 *
 * @author Andrienko Alexander
 */
public class FormatterStore implements TextStore {

  public Document document;

  public FormatterStore(Document document) {
    this.document = document;
  }

  /** {@inheritDoc} */
  @Override
  public char get(int offset) {
    return document.getContents().charAt(offset);
  }

  /** {@inheritDoc} */
  @Override
  public String get(int offset, int length) {
    return document.getContentRange(offset, length);
  }

  /** {@inheritDoc} */
  @Override
  public int getLength() {
    return document.getContentsCharCount();
  }

  /** {@inheritDoc} */
  @Override
  public void replace(int offset, int length, String text) {
    document.replace(offset, length, text);
  }

  /** {@inheritDoc} */
  @Override
  public void set(String text) {
    throw new UnsupportedOperationException("Set method is unsupported in document!");
  }
}
