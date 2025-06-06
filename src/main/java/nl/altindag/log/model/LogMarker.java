/*
 * Copyright 2019 Thunderberry.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.altindag.log.model;

import java.util.List;
import java.util.Objects;

public final class LogMarker {

    private final String name;
    private final List<LogMarker> references;

    public LogMarker(String name, List<LogMarker> references) {
        this.name = name;
        this.references = references;
    }

    public String getName() {
        return name;
    }

    public List<LogMarker> getReferences() {
        return references;
    }

    @Override
    public String toString() {
        return "LogMarker{" +
                "name='" + name + '\'' +
                ", references=" + references +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LogMarker)) return false;
        LogMarker logMarker = (LogMarker) o;
        return Objects.equals(name, logMarker.name)
                && Objects.equals(references, logMarker.references);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, references);
    }
}
