package day45.programmerDI;

public class Engine {

		private int engineLitreCapacity;
		private String engineType;
		private int engineHorsePower;
		
		public Engine() {}
		public Engine(int engineLitreCapacity, String engineType, int engineHorsePower) {
			this.engineLitreCapacity = engineLitreCapacity;
			this.engineType = engineType;
			this.engineHorsePower = engineHorsePower;
		}
		public int getEngineLitreCapacity() {
			return engineLitreCapacity;
		}
		public void setEngineLitreCapacity(int engineLitreCapacity) {
			this.engineLitreCapacity = engineLitreCapacity;
		}
		public String getEngineType() {
			return engineType;
		}
		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		public int getEngineHorsePower() {
			return engineHorsePower;
		}
		public void setEngineHorsePower(int engineHorsePower) {
			this.engineHorsePower = engineHorsePower;
		}
		@Override
		public String toString() {
			return "Engine [engineLitreCapacity=" + engineLitreCapacity + ", engineType=" + engineType
					+ ", engineHorsePower=" + engineHorsePower + "]";
		}
		
		
}
