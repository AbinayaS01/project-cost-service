-- Insert data into project_cost
INSERT INTO project_cost (profit_cost, labour_cost, material_cost, variation_id) 
VALUES 
(200.00, 300.00, 500.00, 1),  -- Associated with Ocean Breeze (variation_id 1)
(240.00, 300.00, 660.00, 2),  -- Associated with Forest Whisper (variation_id 2)
(300.00, 525.00, 675.00, 3),  -- Associated with Sunset Mirage (variation_id 3)
(80.00, 400.00, 320.00, 4),   -- Associated with Geometric Glow (variation_id 4)
(165.00, 275.00, 660.00, 5),  -- Associated with Rustic Charm (variation_id 5)
(195.00, 481.00, 624.00, 6);  -- Associated with Abstract Waves (variation_id 6)

-- Insert data into project_cost (Ceiling Design Costs)
INSERT INTO project_cost (profit_cost, labour_cost, material_cost, variation_id) 
VALUES 
(300.00, 450.00, 750.00, 7),  -- Associated with Classic Tray Ceiling (variation_id 7)
(200.00, 300.00, 500.00, 8),  -- Associated with Geometric Ceiling Design (variation_id 8)
(400.00, 600.00, 1000.00, 9), -- Associated with Coffered Ceiling (variation_id 9)
(360.00, 540.00, 900.00, 10),  -- Associated with Skylight Ceiling (variation_id 10)
(260.00, 390.00, 650.00, 11);  -- Associated with Wooden Panel Ceiling (variation_id 11)

-- Insert data into project_cost (Lighting Design Costs)
INSERT INTO project_cost (profit_cost, labour_cost, material_cost, variation_id) 
VALUES 
(500.00, 750.00, 1250.00, 12),  -- Associated with Chandeliers (variation_id 1)
(240.00, 360.00, 600.00, 13),   -- Associated with Recessed LED Lighting (variation_id 2)
(300.00, 450.00, 750.00, 14),   -- Associated with Pendant Lights (variation_id 3)
(260.00, 390.00, 650.00, 15),   -- Associated with Track Lighting (variation_id 4)
(440.00, 660.00, 1100.00, 16),  -- Associated with Smart LED Ceiling Lights (variation_id 5)
(160.00, 240.00, 400.00, 17);   -- Associated with Floor Lamps (variation_id 6)

