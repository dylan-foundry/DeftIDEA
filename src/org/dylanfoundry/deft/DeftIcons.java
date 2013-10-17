/*
 * Copyright 2013, Bruce Mitchener, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dylanfoundry.deft;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class DeftIcons {
  private static Icon load(String path) {
    return IconLoader.getIcon(path, DeftIcons.class);
  }

  public static final Icon DYLAN_FILE = load("/org/dylanfoundry/deft/icons/file_dylan.png");
  public static final Icon MELANGE_INTERFACE_FILE = load("/org/dylanfoundry/deft/icons/file_intr.png");
  public static final Icon LID_FILE = load("/org/dylanfoundry/deft/icons/file_lid.png");
  public static final Icon DEFT = load("/org/dylanfoundry/deft/icons/file_dylan.png");

  public static final Icon DEFINER_CLASS = load("/org/dylanfoundry/deft/icons/definer_class.png");
  public static final Icon DEFINER_CONSTANT = load("/org/dylanfoundry/deft/icons/definer_constant.png");
  public static final Icon DEFINER_COPYDOWN = load("/org/dylanfoundry/deft/icons/definer_copydown.png");
  public static final Icon DEFINER_DOMAIN = load("/org/dylanfoundry/deft/icons/definer_domain.png");
  public static final Icon DEFINER_FUNCTION = load("/org/dylanfoundry/deft/icons/definer_function.png");
  public static final Icon DEFINER_GENERIC = load("/org/dylanfoundry/deft/icons/definer_generic.png");
  public static final Icon DEFINER_LIBRARY = load("/org/dylanfoundry/deft/icons/definer_library.png");
  public static final Icon DEFINER_MACRO = load("/org/dylanfoundry/deft/icons/definer_macro.png");
  public static final Icon DEFINER_METHOD = load("/org/dylanfoundry/deft/icons/definer_method.png");
  public static final Icon DEFINER_MODULE = load("/org/dylanfoundry/deft/icons/definer_module.png");
  public static final Icon DEFINER_SUITE = load("/org/dylanfoundry/deft/icons/definer_suite.png");
  public static final Icon DEFINER_TEST = load("/org/dylanfoundry/deft/icons/definer_test.png");
  public static final Icon DEFINER_UNKNOWN = load("/org/dylanfoundry/deft/icons/definer_unknown.png");
  public static final Icon DEFINER_VARIABLE = load("/org/dylanfoundry/deft/icons/definer_variable.png");
}

