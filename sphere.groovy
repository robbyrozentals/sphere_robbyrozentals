//create a sphere
CSG sphere = new Sphere(23)// Spheres radius
				.toCSG()// convert to CSG to display
				
CSG sphereHighRes = new Sphere(10,// Spheres radius
						75,//elevation Divisions
						30)// vertical divisions
						.toCSG()// convert to CSG to display
CSG sphere2 = new Sphere(23)// Spheres radius
				.toCSG()// convert to CSG to display
sphere2=sphere2.movex(-65)									
sphere=sphere.movex(55)
return [sphere,sphereHighRes,sphere2]
