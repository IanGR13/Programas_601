package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		
		private var fondo_new: fondo = new fondo();
		private var piso_new: piso = new piso();
		private var antagonista_new: antagonista = new antagonista();
		private var protagonista_new: protagonista = new protagonista();
		private var bala_new: bala = new bala();
		
		public function setup() {
			
			addChild(fondo_new);
			addChild(piso_new);
			addChild(antagonista_new);
			addChild(protagonista_new);
			addChild(bala_new);
			
			piso_new.y=358;
			piso_new.x=270;
			
			fondo_new.y=200;
			fondo_new.x=274;
			
			protagonista_new.y=350;
			protagonista_new.x=250;
			
			antagonista_new.y=30;
			antagonista_new.x=250;
			
		}
	}
	
}
