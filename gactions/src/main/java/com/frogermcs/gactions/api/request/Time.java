package com.frogermcs.gactions.api.request;

import lombok.*;

/**
 * Created by froger_mcs on 17/01/2017.
 */
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Time {
    public int seconds;
    public int nanos;
}
