/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package docs.home.immutable;

import lombok.Value;

// #lombok-immutable
@Value
public class LombokUser {

  String name;

  String email;
}
// #lombok-immutable
