
package calc

class Calculator {
  
  var memValue = 0
  
  def apply() = memValue
  def apply(x: Int) = { memValue = x }
  def reset() = { memValue = 0 }
  def add(x: Int) = { memValue += x }
  def div(x: Int) = { memValue /= x }
  
}