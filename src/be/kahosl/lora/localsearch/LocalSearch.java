/*******************************************************************************
 * Copyright 2012 Wim Vancroonenburg, Tony Wauters, CODeS research group, KAHO Sint-Lieven, Gent, Belgium
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package be.kahosl.lora.localsearch;

import be.kahosl.lora.localsearch.objective.ObjectiveFunction;
import be.kahosl.lora.localsearch.termination.TerminationCriterion;

public interface LocalSearch<S extends Solution> {

	public S startSearch(
				S initialSolution, 
				ObjectiveFunction<S> objectiveFunction,
				TerminationCriterion terminationCriterion);
	
	public void addLocalSearchListener(LocalSearchListener<S> listener);
	
	public void stopSearch();
}
