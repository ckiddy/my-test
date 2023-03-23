package ${{values.package}};

import ${{values.package}}.resources.${{values.filePrefix}}Resource;
import ${{values.package}}.${{values.filePrefix}}Config;

public class ${values.filePrefix}App extends RestApplication<${{values.filePrefix}}Config> {

	public static void main(String[] args) throws Exception {
		new ${{values.filePrefix}}App().run(args);
	}

	@Override
	public void start(${{values.filePrefix}}Config t, AppEnvironment environment) throws Exception {
		environment.registerResource(${{values.filePrefix}}Resource.class);
	}
}
